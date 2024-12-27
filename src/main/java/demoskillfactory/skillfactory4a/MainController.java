package demoskillfactory.skillfactory4a;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {

    @GetMapping(path = "/")
    ResponseEntity<Map<String,String>> mainController(){
        Map<String,String> stringStringMap = new HashMap<>();
        stringStringMap.put("message","Красный диплом!");

        return ResponseEntity.status(HttpStatus.OK).body(stringStringMap);
    }

}
