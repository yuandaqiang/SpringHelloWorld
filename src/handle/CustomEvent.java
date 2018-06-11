package handle;

import org.springframework.context.ApplicationEvent;

public class CustomEvent  extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public CustomEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "CustomEvent";
    }
}
