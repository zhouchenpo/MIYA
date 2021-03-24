package org.mushroom.miya.controller;


import org.mushroom.miya.model.MiyaDatabaseInfo;
import org.mushroom.miya.service.MiyaDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 数据库信息操作controller
 */
@RestController
public class MiyaDatabaseInfoController {

    @Autowired
    private MiyaDatabaseService miyaDatabaseService;

    @GetMapping("/getAll")
    List<MiyaDatabaseInfo> getAll() {
        return miyaDatabaseService.getAll();
    }

    @PostMapping("/save")
    MiyaDatabaseInfo save(@RequestBody MiyaDatabaseInfo info) {
        return miyaDatabaseService.save(info);
    }

}
