package me.ygy.jjvm.instructions.stack;

import me.ygy.jjvm.instructions.base.NoOperandsInstruction;
import me.ygy.jjvm.rtda.Frame;
import me.ygy.jjvm.rtda.LocalVars;
import me.ygy.jjvm.rtda.OperandStack;

/**
 * Created by guangyuanyu on 2016/10/14.
 */
public class Swap extends NoOperandsInstruction{

    @Override
    public void execute(Frame frame) {
        OperandStack stack = frame.getOperandStack();
        LocalVars.Slot v1 = stack.popSlot();
        LocalVars.Slot v2 = stack.popSlot();
        stack.pushSlot(v1);
        stack.pushSlot(v2);
    }
}
