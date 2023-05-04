package day13.exam03;

import lombok.AllArgsConstructor;
import lombok.Data;
//Data= 생성자, getter, setter, equilsHashcode, toString 올인원 패키지
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Member {
	private String id;
	private String name;
	private int age;
}
