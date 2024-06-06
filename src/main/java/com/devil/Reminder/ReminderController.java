package com.devil.Reminder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
public class ReminderController {
@Autowired
private ReminderRepo reminderRepo;

@GetMapping("/")
public  List<Reminder> getAllReminder(){
    return reminderRepo.findAll();
}

@PostMapping("/")
    public String postReminder(@RequestBody Reminder reminder){
    reminderRepo.save(reminder);
    return "reminder Saved";
}

@DeleteMapping("/reminders/{id}")
    public String deleteReminder(@PathVariable Long id){
    reminderRepo.deleteById(id);
    return "deleted";
}


}
