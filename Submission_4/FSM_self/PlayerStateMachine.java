package FSM_self;

public class PlayerStateMachine
{

    public PlayerState currentState;

    // 对应你C#里的 Initialize
    public void initialize(PlayerState startState) {
        currentState = startState;
        currentState.enter();
    }

    public void changeState(PlayerState newState) {
        currentState.exit();
        currentState = newState;
        currentState.enter();
    }

}
