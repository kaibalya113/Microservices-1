package com.user.main.service;

import com.user.main.model.Contact;
import com.user.main.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;
    //fake userlist
    List<User> userList =  List.of(
            new User(190L, "keishan mohaty", "7008310868"),
            new User(191L, "kaibalya mohaty", "7682071631"),
            new User(192L, "manas sahoo", "99887766"),
            new User(193L, "sagar sharma", "0099876543"),
            new User(194L, "nidhi mohan", "123456789")
    );
    public User getUser(Long userId){
        User user1 =  this.userList.stream().filter(user->user.getUserId().equals(userId)).findAny().orElse(null);
        List<Contact> contact = restTemplate.getForObject("http://localhost:8082/contact/user/"+user1.getUserId(), List.class);
        user1.setContactList(contact);
        return user1;
    }
}
