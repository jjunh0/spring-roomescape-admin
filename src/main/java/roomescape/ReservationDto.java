package roomescape;

import java.time.LocalDate;
import java.time.LocalTime;

public record ReservationDto(long id, String name, LocalDate date, LocalTime time) {
    public static ReservationDto from(Reservation reservation) {
        return new ReservationDto(reservation.getId(), reservation.getName(), reservation.getDate(),
                reservation.getTime());
    }
}
