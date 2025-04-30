package btvnbuoi6springboot.btvnbuoi6.dto.employeesDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate; @AllArgsConstructor
@NoArgsConstructor

public class EmployeesUpdateRequest {

        private String fullName;
        private LocalDate birthday;
        private LocalDate hiredDate;
        private BigDecimal salary;

        public String getFullName() {
                return fullName;
        }

        public void setFullName(String fullName) {
                this.fullName = fullName;
        }

        public LocalDate getBirthday() {
                return birthday;
        }

        public void setBirthday(LocalDate birthday) {
                this.birthday = birthday;
        }

        public LocalDate getHiredDate() {
                return hiredDate;
        }

        public void setHiredDate(LocalDate hiredDate) {
                this.hiredDate = hiredDate;
        }

        public BigDecimal getSalary() {
                return salary;
        }

        public void setSalary(BigDecimal salary) {
                this.salary = salary;
        }
}
