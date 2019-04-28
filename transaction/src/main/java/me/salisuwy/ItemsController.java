package me.salisuwy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {
  @Autowired
    ItemsRepository itemsRespository;


    @GetMapping("/AllItems")
    public List<Items> findAllItems()
    {
    	return itemsRespository.findAllItems();
    }
    
    @GetMapping("/AccountItems")
    public List<Items> findAllAccountItems()
    {
    	return itemsRespository.findAllAccountItems();
    }
}
