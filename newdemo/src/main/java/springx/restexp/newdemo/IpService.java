package springx.restexp.newdemo;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface IpService extends CrudRepository<Product,Integer> {

	
	

	
}
