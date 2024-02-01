package subway.fixture;

import subway.dto.LineRequest;

public class LineFixture {
	public static LineRequest 신분당선_생성() {
		return new LineRequest("신분당선", "bg-red-600", 1L, 2L, 10L);
	}

	public static LineRequest 분당선_생성() {
		return new LineRequest("분당선", "bg-red-600", 1L, 3L, 10L);
	}
}