package utils.message;

public interface LeaveMessage {
    public abstract void setMediator(Mediator mediator);
    public abstract void leaveMessage(String message);
}
