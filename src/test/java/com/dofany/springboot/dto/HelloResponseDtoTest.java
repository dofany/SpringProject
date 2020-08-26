package com.dofany.springboot.dto;
import static org.assertj.core.api.Assertions.assertThat;
import com.dofany.springboot.web.dto.HelloResponseDto;
import org.junit.Test;

public class HelloResponseDtoTest {
    @Test
    public void 롬북_기능_테스트() {
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name,amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getName()).isEqualTo(amount);
    }
}
