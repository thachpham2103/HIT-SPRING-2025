package buoi7.buoi7ol.service.impl;

import buoi7.buoi7ol.constant.ErrorMessage;
import buoi7.buoi7ol.doman.dto.pagination.PaginationResponse;
import buoi7.buoi7ol.doman.dto.pagination.PagingMeta;
import buoi7.buoi7ol.doman.dto.repuest.HotelCreatDTO;
import buoi7.buoi7ol.doman.dto.response.HotelResponseDTO;
import buoi7.buoi7ol.doman.dto.pagination.PaginationRequestDTO;
import buoi7.buoi7ol.doman.entity.Hotel;
import buoi7.buoi7ol.doman.mapper.HotelMapper;
import buoi7.buoi7ol.exception.ResourceNotFoundException;
import buoi7.buoi7ol.repository.HotelRepository;
import buoi7.buoi7ol.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.Collections;
import java.util.List;

@Service
//@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    @Autowired
    private final HotelRepository hotelRepository;
@Autowired
    private final HotelMapper hotelMapper;

    public HotelServiceImpl(HotelRepository hotelRepository, HotelMapper hotelMapper) {
        this.hotelRepository = hotelRepository;
        this.hotelMapper = hotelMapper;
    }

    @Override
    public PaginationResponse<HotelResponseDTO> getAllHotels(PaginationRequestDTO request) {
        Pageable pageable = (Pageable) PageRequest.of(request.getPageNum(), request.getPageSize(), Sort.by("createdDate").descending());
        Page<Hotel> pageResult = hotelRepository.findAll((org.springframework.data.domain.Pageable) pageable);

        if (pageResult.isEmpty()) {
            throw new ResourceNotFoundException(ErrorMessage.Hotel.ERR_NOT_FOUND);
        }

        List<HotelResponseDTO> hotelResponseDTOS = Collections.singletonList(hotelMapper.toDTOList((Hotel) pageResult.getContent()));
        PaginationResponse<HotelResponseDTO> response = new PaginationResponse<>(
                hotelResponseDTOS,
                new PagingMeta(pageResult.getTotalElements(), pageResult.getTotalPages(), request.getPageNum() + 1, request.getPageSize(), "createdDate", "desc")
        );
        return response;
    }

    @Override
    public HotelResponseDTO createHotel(HotelCreatDTO hotelCreatDTO) {
        Hotel hotel = hotelMapper.toHotel(hotelCreatDTO);
        hotelRepository.save(hotel);
        return hotelMapper.toDTOList(hotel);
    }
}
