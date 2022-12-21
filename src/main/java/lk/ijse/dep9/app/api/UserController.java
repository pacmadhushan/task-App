package lk.ijse.dep9.app.api;

import lk.ijse.dep9.app.dto.UserDTO;
import lk.ijse.dep9.app.util.ValidationGroups;
import lk.ijse.dep9.dao.custom.UserDAO;
import org.springframework.http.HttpStatus;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json")
    public void createUserAccount(@Validated(ValidationGroups.Create.class) @RequestBody UserDTO user){
        System.out.println(user);

    }
    @PatchMapping(value = "/me",consumes = "application/json")
    public void updateUserAccountDetails(){

    }
    @GetMapping(value = "/me",produces ="application/json" )
    public UserDTO getUserAccountDetails(){
        System.out.println("getUserAccountDetails");
        return new UserDTO();

    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/me")
    public void deleteUserAccountDetails(){
        System.out.println("deleteUserAccount()");

    }
}
