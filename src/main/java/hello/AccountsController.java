package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class AccountsController {

    @RequestMapping("/accounts/getAccountTypes")
    public ArrayList<String> getAccountTypes() {
        List<String> namesList = Arrays.asList( "Current Account", "Savings Account", "Checking Account", "$ Super Saver Account");
         
        //List 2
        ArrayList<String> otherList = new ArrayList<>();
         
        //Copy all items from list 1 to list 2
        otherList.addAll(namesList);   
		
		return otherList;
    }

}