package buoi7.buoi7ol.doman.mapper;

import buoi7.buoi7ol.doman.dto.repuest.HotelCreatDTO;
import buoi7.buoi7ol.doman.dto.response.HotelResponseDTO;
import buoi7.buoi7ol.doman.entity.Hotel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HotelMapper {
   HotelResponseDTO toDTOList(Hotel hotell);
   List<HotelResponseDTO> toDoList(List<Hotel> hotells);
    Hotel toHotel(HotelCreatDTO hotelCreatDTO);
}
