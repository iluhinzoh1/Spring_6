package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.Service.userService;
import web.models.User;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private userService service;

    @GetMapping()
    public String getPersonDetails(Model model) {
        List<User> user = service.getAllUsers();
        model.addAttribute("messages", user);
        return "User";
    }

    @GetMapping("/addNewUser")
    public String addNewUser(Model model) {
        model.addAttribute("newUser", new User());
        return "user-info";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("newUser") User user) {
        service.saveUsers(user);
        return "redirect:/";
    }

    @GetMapping("/updateUser")
    public String updateUsers(@RequestParam(value = "id") Long id, Model model) {
        model.addAttribute("updateUserId", service.getUser(id));
        return "update";
    }

    @PostMapping("updateUserById")
    public String updateUserById(@ModelAttribute("updateUserId") User user) {
        service.updateUser(user);
        return "redirect:/";
    }

    @GetMapping("deleteUser")
    public String deleteUserById(@RequestParam(value = "id") Long id) {
        service.deleteUser(id);
        return "redirect:/";
    }


}

