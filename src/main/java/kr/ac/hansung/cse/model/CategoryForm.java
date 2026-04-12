package kr.ac.hansung.cse.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryForm {
    @NotNull(message = "카테고리 이름을 입력하세요.") // null 허용 안함 (빈 문자열 허용)
    @Size(max = 50, message = "50자 이내로 입력하세요.") // 문자열 길이, 범위 제한
    private String name;

}
