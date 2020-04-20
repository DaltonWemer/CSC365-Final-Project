package edu.missouristate.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import edu.missouristate.model.Example;

//import com.oreillyauto.dao.custom.ExampleRepositoryCustom;
//import com.oreillyauto.domain.examples.Example;

@Repository
public class ExampleRepository {
	
	@Autowired
	JdbcTemplate template;
	
    public ExampleRepository() {
    }    
    
	public List<Example> getExamples() {
		String sql = "SELECT id, first_name, last_name " + 
	                 "  FROM examples ";
		Object[] args = null;
		List<Map<String, Object>> result = template.queryForList(sql, args);
		List<Example> exampleList = new ArrayList<Example>();
		
		for (Map<String, Object> map : result) {
			Example example = new Example();
			
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				String key = entry.getKey();
				String data = ((entry.getValue() == null) ? null : entry.getValue().toString());

				switch(key) {
				case "ID":					
					example.setId(Integer.valueOf(data));
					break;
				case "FIRST_NAME":
					example.setFirstName(data);
					break;
				case "LAST_NAME":
					example.setLastName(data);
					break;
				}
			}
			
			if (example.getId() != null) {
				exampleList.add(example);
			}
		}
		
		
//		List<Example> exampleList = new ArrayList<Example>();
//		
//		for (Map.Entry<String, Object> entry : map.entrySet()) {
//		    String key = entry.getKey();
//		    Object value = entry.getValue();
//		    // ...
//		}
		
		return exampleList;
	}
    
    
//    
//    public void printList(List<?> list) {
//        for (Object result : list) {
//            System.out.println(result);
//        }
//    }
//
//    @SuppressWarnings("unchecked")
//    @Override
//    public List<Example> getExampleById(Integer id) {
//        String sql = "SELECT * " + 
//                     "  FROM examples " + 
//                     " WHERE id = ?";
//        Query query = getEntityManager().createNativeQuery(sql);
//        query.setParameter(1, id); // NOTICE PARAMETERS ARE "1-BASED" and not "0-based"
//        return (List<Example>)query.getResultList();
//    }
//    

//    
//	@SuppressWarnings("unchecked")
//	private void testDayFour() {
//		
//		// INSERT Example - Typed SQL
//		// Since we deleted all users with last_name = "Brannon" yesterday,
//		// let's create a new one.
//        String sql = "INSERT INTO examples (first_name, last_name) " + 
//                     "VALUES ('Jeffery', 'Brannon') ";
//        Query query = getEntityManager().createNativeQuery(sql);
//        query.executeUpdate();
//		
//		

//	
//    @SuppressWarnings("unchecked")
//    @Override
//    public List<Object> getTables() {
//        String sql = "  SELECT st.tablename " + 
//        	  	     "    FROM sys.systables st " + 
//        		     "   WHERE st.tablename NOT LIKE 'SYS%'" +
//        		     "ORDER BY st.tablename";
//        Query query = getEntityManager().createNativeQuery(sql);
//        return (List<Object>)query.getResultList();
//    }
}

