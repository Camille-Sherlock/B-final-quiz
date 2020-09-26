package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Group;
import com.thoughtworks.capability.gtb.entrancequiz.service.GroupService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
    @RequestMapping("/groups")
    public class GroupController {
        private final GroupService groupService;

        public GroupController(GroupService groupService) {
            this.groupService = groupService;
        }

        //TODO GTB：如果没有定制化的返回需求，可以省略ResponseEntity
        @GetMapping
        public ResponseEntity<List<Group>> getGroups(){
            return ResponseEntity.ok(groupService.findAllGroups());
        }
}
