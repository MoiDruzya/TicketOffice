package MoiDruzya.TicketOffice.entity;
import java.util.HashMap;
import java.util.Map;

public enum TicketType {
    ADULT((byte) 0, "adult"),
    CHILD((byte) 1, "child"),

    INVALIDS((byte) 2, "invalids");

    private static Map<Byte, TicketType> ticketMap = new HashMap<>();
    static {
        for (TicketType v : values()) {
            ticketMap.put(v.ticketType, v);
        }
    }

    private final byte ticketType;
    private final String name;
    TicketType(byte ticketType, String name) {
        this.ticketType = ticketType;
        this.name = name;
    }

    public static TicketType getByType(byte type) {
        return ticketMap.getOrDefault(type, ADULT);
    }

}
