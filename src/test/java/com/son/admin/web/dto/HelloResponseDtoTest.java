package com.son.admin.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/*
    assertThat -> assertj 테스트 검증 라이브러리 검증 메소드
                  검증하고 싶은 대상 메소드 인자로 받음
    isEqualTo -> assertj의 동등 비교 메소드, assertThat의 값과 동일 시 성공
    Junit 기본 assertThat이 아닌 assertj의 assertThat을 사용한 이유!!
        -> CoreMatchers와 달리 추가적인 라이브러리 불필요, 확실한 자동완성 지원
 */
public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
