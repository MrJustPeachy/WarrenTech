# PROGRAM NAME: hot_and_cold_learning.py
# PROGRAM PURPOSE: Use the simplest form of learning - hot and cold method (adjusting weights)
# PROGRAMMER: Dillon Pietsch
# DATE WRITTEN: 8/22/2017

weight = 0.1
lr = 0.01


def neural_network(input, weight):
    prediction = input * weight

    return prediction

number_of_toes = [8.5]
win_or_lose_binary = [1]

input = number_of_toes[0]
true = win_or_lose_binary[0]

pred = neural_network(input, weight)

error = (pred - true) ** 2

prediction_up = neural_network(input, weight + lr)
error_up = (prediction_up - true) ** 2

prediction_down = neural_network(input, weight - lr)
error_down = (prediction_down - true) ** 2

if error > error_down or error_up:

    if error_down < error_up:
        weight -= lr

    if error_up < error_up:
        weight += lr