package org.mushroom.miya.controller;


import lombok.extern.slf4j.Slf4j;
import org.mushroom.miya.model.MiyaDatabaseTableInfo;
import org.mushroom.miya.model.common.ActionResult;
import org.mushroom.miya.service.MiyaDatabaseTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 数据库信息操作controller
 */
@RestController
@RequestMapping("/v1/database")
@Slf4j
public class MiyaDatabaseInfoController {

    @Autowired
    private MiyaDatabaseTableService miyaDatabaseTableService;

    @GetMapping("/getAll")
    ActionResult<List<MiyaDatabaseTableInfo>> getAll() {
        return new ActionResult<>(miyaDatabaseTableService.getAll());
    }

    @PostMapping("/save")
    ActionResult<MiyaDatabaseTableInfo> save(@RequestBody MiyaDatabaseTableInfo info) {
        return new ActionResult<>(miyaDatabaseTableService.save(info));
    }

    @PostMapping("/standardiseAllInDatabase")
    ActionResult<Object> standardiseAllInDatabaseById(@RequestParam Long id) {
        try{
            miyaDatabaseTableService.standardiseAllRecordInDB(id);
        }catch (Exception e){
            log.error(e.toString());
            return new ActionResult<>("error!",false);
        }
        return new ActionResult<>("finish",true);
    }

}
