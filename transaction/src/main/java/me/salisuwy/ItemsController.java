package me.salisuwy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {
  @Autowired
    ItemsRepository itemsRepository;

    @GetMapping("/AllItems")
    public List<Items> findAllItems()
    {
    	return itemsRepository.findAllItems();
    }
    
    @GetMapping("/AccountItems")
    public List<Items> findAllAccountItems()
    {
    	return itemsRepository.findAllAccountItems();
    }
    
    @GetMapping("/AccountItems/{id}")
    public List<Items> findAccountItemById(@PathVariable String id){
    	int pID = Integer.parseInt(id);
    	return itemsRepository.findAccountItemById(pID);
    }
    
    @GetMapping("/AllItems/{id}")
    public List<Items> findItemById(@PathVariable String id){
    	int pID = Integer.parseInt(id);
    	return itemsRepository.findItemById(pID);
    }
}
