package buoi7.buoi7ol.service;

import buoi7.buoi7ol.doman.dto.pagination.PaginationRequestDTO;
import buoi7.buoi7ol.doman.dto.pagination.PaginationResponse;
import buoi7.buoi7ol.doman.dto.repuest.HotelCreatDTO;
import buoi7.buoi7ol.doman.dto.response.HotelResponseDTO;

public interface HotelService {

    PaginationResponse<HotelResponseDTO> getAllHotels(PaginationRequestDTO request);
    HotelResponseDTO createHotel(HotelCreatDTO hotelCreatDTO);
}
