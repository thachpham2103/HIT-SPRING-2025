package btvnbuoi6springboot.btvnbuoi6.service;

import btvnbuoi6springboot.btvnbuoi6.dto.positionsDTO.PositionsCreateRequest;
import btvnbuoi6springboot.btvnbuoi6.dto.positionsDTO.PositionsUpdateRequest;
import btvnbuoi6springboot.btvnbuoi6.entity.Positions;
import btvnbuoi6springboot.btvnbuoi6.repository.PositionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class PositionsService {

    @Autowired
    private PositionsRepository positionsRepository;

    public List<Positions> getPositions(long positionsId){
        return positionsRepository.findAll();
    }

    public Positions createPositions(PositionsCreateRequest request){

        Positions positions= new Positions();

        positions.setDescription(request.getDescription());
        positions.setTitle(request.getTitle());
        return positionsRepository.save(positions);
    }

    public Positions updatePositions(PositionsUpdateRequest request, long id){
        Positions positions = (Positions) getPositions(id);

        positions.setTitle(request.getTitle());
        positions.setDescription(request.getDescription());

        return positionsRepository.save(positions);
    }

    public void deletePositions(long id){
        positionsRepository.deleteById(id);
    }
}
