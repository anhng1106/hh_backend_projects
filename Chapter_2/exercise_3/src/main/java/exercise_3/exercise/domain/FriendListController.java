package exercise_3.exercise.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import exercise_3.exercise.web.Friends;

@Controller
public class FriendListController {

     // Create a list of students
    private List<Friends> friendList = new ArrayList<>();

    @GetMapping("/index") 
    public String getFriendList(Model model) {
        model.addAttribute("friend", new Friends());
        // Add the list to the model
        model.addAttribute("friendlist", friendList);
        return "friendlist.html"; 
    }

    @PostMapping("/index")
	public String addFriends(@ModelAttribute Friends inputFriend) {
        friendList.add(inputFriend);
		return "redirect:/index";
	}
}

    