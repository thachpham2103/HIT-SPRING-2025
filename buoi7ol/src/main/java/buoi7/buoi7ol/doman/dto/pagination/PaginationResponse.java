package buoi7.buoi7ol.doman.dto.pagination;

import buoi7.buoi7ol.doman.dto.response.HotelResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
//@AllArgsConstructor
public class PaginationResponse<T> {

    private List<T> data;
    private PagingMeta mete;

//    public PaginationResponse(PagingMeta mete, List<T> data) {
//        this.mete = mete;
//        this.data = data;
//    }

    public PaginationResponse(List<HotelResponseDTO> hotelResponseDTOS, PagingMeta pagingMeta) {
    }

//    public PaginationResponse(List<HotelResponseDTO> hotelResponseDTOS, PagingMeta pagingMeta) {
//    }
}
