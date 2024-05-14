package com.example.homeservehub.controllers;

import com.example.homeservehub.entities.User;
import com.example.homeservehub.enums.UserState;
import com.example.homeservehub.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @RequestMapping("/createUser")
    public String createUser() {
        return "CreateUser";
    }

    @RequestMapping("saveUser")
        public String saveUser (@ModelAttribute("userVue") User userController){
            userController.setUserState(UserState.New);
            User saveUser = userService.saveUser(userController);
            return "CreateUser";
        }

    @RequestMapping("/userList")
        public String userList (ModelMap modelMap,
                                @RequestParam(name="page",defaultValue = "0") int page,
                                @RequestParam(name="size",defaultValue = "10") int size
                                ){
            Page<User> usersController = userService.getAllUserByPage(page,size);
            modelMap.addAttribute("userVue", usersController);
            modelMap.addAttribute("currentPage", page);
            modelMap.addAttribute("page", new int[usersController.getTotalPages()]);
            return "UserList";
        }

    @RequestMapping("/deleteUser")
    public String deleteUser (@RequestParam("id")Long id, ModelMap modelMap,
                              @RequestParam(name="page",defaultValue = "0") int page,
                              @RequestParam(name="size",defaultValue = "10") int size
                                ){
        userService.deleteUserById(id);
        Page<User> usersController = userService.getAllUserByPage(page,size);
        modelMap.addAttribute("userVue", usersController);
        modelMap.addAttribute("currentPage", page);
        modelMap.addAttribute("page", new int[usersController.getTotalPages()]);
        return "UserList";
         }
    @RequestMapping("/editUser")
    public String editUser (@RequestParam("id")Long id, ModelMap modelMap){
        User userController = userService.getUserById(id);
        modelMap.addAttribute("userVue",userController);
        return "EditUser";
    }
    @RequestMapping("/updateUser")
    public String updateUser(@ModelAttribute("userVue") User userController) {
        userService.updateUser(userController);
        return createUser();
    }
    @RequestMapping("/")
    public String LandingUser (){
        return "LandingPage";
    }
    @GetMapping("/loginUser")
    public String showLoginUser() {
        return "LoginUser";
    }
    @GetMapping("/login")
    public String showLoginAdmin() {
        return "LoginAdmin";
    }
    @PostMapping("/loginAct")
    public String sLoginAdmin(@ModelAttribute User user ) {
        System.out.println(user.getEmail());
        User user1=userService.getUserBy(user.getEmail());
        if(user1!=null){
            System.out.println("khedama");
            if(user1.getPassword().equals(user.getPassword())){
                System.out.println("khedama@");
                return "Home";
            }
        }
        return showLoginUser();
    }
    @GetMapping("/logout")
    public String showLogoutPage() {
        return "Logout";
    }
    @GetMapping("/home")
    public String home() {
        return "Home";
    }

}


