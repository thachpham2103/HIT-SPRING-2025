package btvnbuoi6springboot.btvnbuoi6.exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeesException {
    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<Long> handlingRuntimeException(RuntimeException exception) {
        return ResponseEntity.badRequest().body(1001L);
    }
}
