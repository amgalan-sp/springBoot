//package mvc.springBoot.service.impl;
//
//import mvc.springBoot.entity.User;
//import mvc.springBoot.repository.UserRepository;
//import mvc.springBoot.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public List<User> allUsers() {
//        return userRepository.findAll();
//    }
//
//    @Override
//    public void add(User user) {
//        userRepository.saveAndFlush(user);
//    }
//
//    @Override
//    public void delete(User user) {
//        userRepository.delete(user);
//    }
//
//    @Override
//    public void edit(User user) {
//        userRepository.saveAndFlush(user);
//    }
//
//    @Override
//    public User getById(int id) {
//        return userRepository.getById(id);
//    }
//}
