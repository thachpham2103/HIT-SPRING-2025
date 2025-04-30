package btvnbuoi6springboot.btvnbuoi6.controller;


import btvnbuoi6springboot.btvnbuoi6.service.PositionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pse")
public class PositionController {

    @Autowired
    private PositionsService positionsService;



}
