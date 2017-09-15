# PROGRAM NAME: enhanced_learning.py
# PROGRAM PURPOSE: Take the idea of hot and cold learning by using direction and measure the amount of error.
# PROGRAMMER: Dillon Pietsch
# DATE WRITTEN: 8/22/2017

weight = 0.5
goal_pred = 0.8
input = 0.5

for iteration in range(20):
    pred = input * weight
    error = (pred - goal_pred) ** 2

    direction_and_amount = (pred - goal_pred) * input
    knob_weight = weight - direction_and_amount

    print("Error: " + str(round(error, 5)) + "\tPrediction: " + str(pred))