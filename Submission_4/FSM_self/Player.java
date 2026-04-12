package FSM_self;

public class Player
{
    public PlayerStateMachine stateMachine;
    public PlayerState idleState;
    public PlayerState moveState;

    public Player() {
        System.out.println("=== Awake() ===");
        stateMachine = new PlayerStateMachine();
        idleState = new PlayerIdleState(this,stateMachine,"idleState");
        moveState = new PlayerMoveState(this,stateMachine,"moveState");
    }

    // 模拟 Unity 的 Start()
    public void start() {
        System.out.println("=== Start() ===");
        stateMachine.initialize(idleState);
    }

    // 模拟 Unity 的 Update()
    public void update() {
        stateMachine.currentState.update();
    }

    public void switchToIdle() {
        if (stateMachine.currentState != idleState) {
            stateMachine.changeState(idleState);
        }
    }

    public void switchToMove() {
        if (stateMachine.currentState != moveState) {
            stateMachine.changeState(moveState);
        }
    }
}
