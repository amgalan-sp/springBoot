package mvc.springBoot.controller;
import mvc.springBoot.repository.UserRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import mvc.springBoot.entity.User;
//import mvc.springBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public ModelAndView allUsers() {
//        List<User>  users = userRepository.allUsers();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("users");
//        modelAndView.addObject("usersList", users);
//        return modelAndView;
//    }
//    @GetMapping("/")
//    public ResponseEntity<List<User>> getAll() {
//        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
//    }
//    private UserRepository userRepository;

//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

//    @GetMapping(value = "/users")
//    public List<User> allUsers() {
//        return userRepository.findAll();
//    }
//    @GetMapping("/users")
//    public String allUsers(Model model) {
//        model.addAttribute("users", userRepository.findAll());
//        return "user";
//    }
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String allUsers() {
//        userRepository.findAll();
//        return "users.jsp";
//    }
    @GetMapping("/")
    public String allUsers(Model model) {
        model.addAttribute("usersList", userRepository.findAll());
        return "users";
    }
}
//
//    @GetMapping(value = "/edit/{id}", method = RequestMethod.GET)
//    public ModelAndView editPage(@PathVariable("id") int id) {
//        User user = userService.getById(id);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("editPage");
//        modelAndView.addObject("user", userService.getById(id));
//        return modelAndView;
//    }
//
//    @GetMapping(value = "/edit", method = RequestMethod.POST)
//    public ModelAndView editUser(@ModelAttribute("user") User user) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("redirect:/");
//        userService.edit(user);
//        return modelAndView;
//    }
//    @GetMapping(value = "/add", method = RequestMethod.GET)
//    public ModelAndView addPage() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("editPage");
//        return modelAndView;
//    }
//    @GetMapping(value = "/add", method = RequestMethod.POST)
//    public ModelAndView addUser(@ModelAttribute("user") User user) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("redirect:/");
//        userService.add(user);
//        return modelAndView;
//    }
//    @GetMapping(value="/delete/{id}", method = RequestMethod.GET)
//    public ModelAndView deleteFilm(@PathVariable("id") int id) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("redirect:/");
//        User user = userService.getById(id);
//        userService.delete(user);
//        return modelAndView;
//    }
