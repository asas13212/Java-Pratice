package FSM_self;

public abstract class PlayerState
{
    protected Player player;
    protected PlayerStateMachine stateMachine;
    protected String animName; // 动画名

    public PlayerState(Player player, PlayerStateMachine stateMachine, String animName) {
        this.player = player;
        this.stateMachine = stateMachine;
        this.animName = animName;
    }

    // 对应进入状态（默认通用逻辑，可被子类复用）
    public void enter() {
        System.out.println("进入状态: " + animName);
    }

    // 对应每帧更新（默认空实现，子类按需重写）
    public void update() {}

    // 对应退出状态（默认通用逻辑，可被子类复用）
    public void exit() {
        System.out.println("退出状态: " + animName);
        System.out.println();
    }

    // 动画触发
    public void animationFinishTrigger() {}
}
