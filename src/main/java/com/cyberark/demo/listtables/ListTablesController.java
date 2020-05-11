
package com.cyberark.demo.listtables;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;



@RestController
public class ListTablesController {

	@Autowired
    	JdbcTemplate jdbcTemplate;

		String theResult;

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/")
	public String index() {
		theResult = "";
		jdbcTemplate.query("SELECT owner,table_name  FROM all_tables", (rs)-> {
		  theResult = theResult +  "<tr><td>";
            	  theResult = theResult + rs.getString("owner");
		  theResult = theResult +  "</td><td>";
		  theResult = theResult + rs.getString("table_name");          
		  theResult = theResult + "</td></tr>";
        	});
		theResult = "<html><head><title>List of Tables</title><style>body {\n  font-family:Arial;\n}</style></head><body><h1>List of Tables</h1><br/><table><thead><tr><th>Owner</th><th>Table</th></tr></thead>" + theResult;
		theResult = theResult+ "</td></th></table></body></html>";
		return theResult;
	};
}
