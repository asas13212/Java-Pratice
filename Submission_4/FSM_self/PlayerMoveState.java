package FSM_self;

public class PlayerMoveState extends PlayerState
{

    public PlayerMoveState(Player player, PlayerStateMachine stateMachine, String animName)
    {
        super(player, stateMachine, animName);
    }

    @Override
    public void enter()
    {
        super.enter();
        System.out.println("您已进入移动状态");
    }

    @Override
    public void update()
    {
        super.update();
    }

    @Override
    public void exit()
    {
        super.exit();
    }
}
