package com.springboot.buoi5.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestData<T> {

    private RestStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public RestData( T data) {
        this.status = RestStatus.SUCCESS;
       this.data=data;
    }

    public RestData(RestStatus restStatus, Object message, Object o) {
    }

    public static RestData<?> error(Object message){
        return new RestData<>(RestStatus.ERROR, message, null);
    }

}
