package pl.wedding.management.service.reservation.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import pl.wedding.management.service.reservation.domain.enums.Occasion;

import java.time.LocalDateTime;

@Builder
@Getter
@AllArgsConstructor
public class ReservationDto {

    public final long id;

    public final LocalDateTime reservationStart;
    public final LocalDateTime reservationEnd;

    public final Object weddingHall; //to be changed
    public final Object tenant; //to be changed

    public int numberOfGuests;

    public final Occasion occasion;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReservationDto that = (ReservationDto) o;

        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return (int) (getId() ^ (getId() >>> 32));
    }
}
