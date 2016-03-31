package me.lty.web;

import me.lty.data.tables.records.MainRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static me.lty.data.Tables.*;
/**
 * Created by LTY on 15/12/28.
 */
@Controller
public class UserController {

//    @Autowired
//    private UserMapper userMapper;
//
//    private final static Logger logger = Logger.getLogger(UserController.class);
//
//    @RequestMapping(value = "/find")
//    public ResponseEntity find() {
//        logger.info("findUserInfo===========");
//        return new ResponseEntity<>(this.userMapper.findUserInfo(), HttpStatus.OK);
//    }

    @Autowired
    DSLContext dsl;

    @RequestMapping(value = "/book")
    public ResponseEntity find(Integer id){
        MainRecord record  = dsl.selectFrom(MAIN).where(MAIN.NUMBER.eq(id)).fetchOne();
        return new ResponseEntity(null,HttpStatus.OK);
    }
}

