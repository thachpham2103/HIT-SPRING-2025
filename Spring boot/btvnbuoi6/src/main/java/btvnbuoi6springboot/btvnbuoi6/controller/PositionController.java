package btvnbuoi6springboot.btvnbuoi6.controller;


import btvnbuoi6springboot.btvnbuoi6.dto.positionsDTO.PositionsCreateRequest;
import btvnbuoi6springboot.btvnbuoi6.dto.positionsDTO.PositionsUpdateRequest;
import btvnbuoi6springboot.btvnbuoi6.entity.Positions;
import btvnbuoi6springboot.btvnbuoi6.service.PositionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pse")
public class PositionController {

    @Autowired
    private PositionsService positionsService;

 @GetMapping("/pos")
    List<Positions> getPositions(@RequestParam long id){
    return positionsService.getPositions(id);
 }

@PostMapping("/pos")
    Positions createPositions(@RequestBody PositionsCreateRequest request){
     return positionsService.createPositions(request);
}

@DeleteMapping("/{positionsId}")
String deletePositions(@PathVariable long id){
     positionsService.deletePositions(id);
     return "thành công!!!";
}

    @PutMapping("/{id}")
    public Positions updatePositions(@PathVariable long id, @RequestBody PositionsUpdateRequest request) {
        return positionsService.updatePositions(request, id);
    }
}
