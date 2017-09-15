# PROGRAM NAME: gradient_descent.py
# PROGRAM PURPOSE: Show a simple use case of gradient descent
# PROGRAMMER: Dillon Pietsch
# DATE WRITTEN: 8/25/2017

weight = 0.1
alpha = 0.01

def neural_network(input, weight):
    prediction = input * weight

    return prediction

number_of_toes = [8.5]
win_or_lose_binary = [1]

input = number_of_toes[0]
true = win_or_lose_binary[0]

pred = neural_network(input, weight)

error = (pred - true) ** 2

delta = pred - true

weight_delta = input * delta

weight -= weight_delta * alpha

# This is simply a single iteration of gradient descent, but using the enhanced_learning.py code in conjunction with
# this technique will automate the process.