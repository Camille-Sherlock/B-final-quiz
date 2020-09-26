package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.Group;
import com.thoughtworks.capability.gtb.entrancequiz.repository.GroupRepository;
//TODO GTB：未使用到的import，需要删掉
import java.util.Collections;
import java.util.List;

public class GroupService {
    private final GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public List<Group> findAllGroups() {
        return groupRepository.findAll();
    }

}
