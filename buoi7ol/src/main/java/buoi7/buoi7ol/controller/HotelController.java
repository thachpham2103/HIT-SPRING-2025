package buoi7.buoi7ol.controller;
import buoi7.buoi7ol.doman.dto.pagination.PaginationRequestDTO;
import buoi7.buoi7ol.doman.dto.pagination.PaginationResponse;
import buoi7.buoi7ol.doman.dto.repuest.HotelCreatDTO;
import buoi7.buoi7ol.doman.dto.response.HotelResponseDTO;
import buoi7.buoi7ol.service.HotelService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequiredArgsConstructor
@RequestMapping("/api/hotels")
public class HotelController {

    @Autowired
    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }


    @Operation(summary = "Lấy danh sách khách sạn theo trang")
    @GetMapping("/getAll")
    public ResponseEntity<PaginationResponse<HotelResponseDTO>> getAllHotels(
            @Parameter(description = "Số trang (bắt đầu từ 0)") @RequestParam int pageNum,
            @Parameter(description = "Kích thước trang") @RequestParam int pageSize) {
        PaginationRequestDTO request = new PaginationRequestDTO(pageNum, pageSize);
        return ResponseEntity.ok(hotelService.getAllHotels(request));
    }

    @Operation(summary = "Tạo mới khách sạn")
    @PostMapping("/create")
    public ResponseEntity<HotelResponseDTO> createHotel(
            @Parameter(description = "Thông tin khách sạn cần tạo") @RequestBody HotelCreatDTO hotelCreatDTO) {
        return ResponseEntity.ok(hotelService.createHotel(hotelCreatDTO));
    }
}
