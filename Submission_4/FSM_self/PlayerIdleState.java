package FSM_self;

public class PlayerIdleState extends PlayerState
{

    public PlayerIdleState(Player player, PlayerStateMachine stateMachine, String animName)
    {
        super(player, stateMachine, animName);
    }

    @Override
    public void enter()
    {
        super.enter();
        System.out.println("您已经进入静止状态");
        update();
    }

    @Override
    public void update()
    {
        super.update();

            System.out.println("您在静止,按A退出");
    }

    @Override
    public void exit()
    {
        super.exit();
    }
}
