package com.codingfundas.nextgreaterelement;

import java.util.Stack;

public class NextGreaterElement {

	public void printNextGreaterElement(int[] inputArr) {

		int i = 0;
		Stack<Integer> stack = new Stack<>();
		//stack.push(-1);

		int nextElement, temp;

		/* pushing first element */
		stack.push(inputArr[0]);

		for (i = 1; i < inputArr.length; i++) {
			nextElement = inputArr[i];

			if (!stack.isEmpty()) {
				temp = stack.pop();

				while (temp < nextElement) {
					System.out.println(temp + " --> " + nextElement);
					if (stack.isEmpty()) {
						break;
					}
					temp = stack.pop();
				}

				if (temp > nextElement) {
					stack.push(temp);
				}
			}
			stack.push(nextElement);
		}
		
		while(!stack.isEmpty()) {
			temp = stack.pop();
			nextElement = -1;
			System.out.println(temp + "--> " + nextElement);
		}
	}

	public static void main(String[] args) {
		int[] inputArr = { 3, 5, 2, 7, 11, 1 };
		NextGreaterElement element = new NextGreaterElement();
		element.printNextGreaterElement(inputArr);
	}
}