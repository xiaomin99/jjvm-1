package me.ygy.jjvm.instructions.math.add;

import me.ygy.jjvm.instructions.base.NoOperandsInstruction;
import me.ygy.jjvm.rtda.Frame;
import me.ygy.jjvm.rtda.OperandStack;

/**
 * Created by guangyuanyu on 2016/10/14.
 */
public class DAdd extends NoOperandsInstruction {

    @Override
    public void execute(Frame frame) {
        OperandStack stack = frame.getOperandStack();
        double v1 = stack.popDouble();
        double v2 = stack.popDouble();
        double result = v1 + v2;
        stack.pushDouble(result);
    }
}
