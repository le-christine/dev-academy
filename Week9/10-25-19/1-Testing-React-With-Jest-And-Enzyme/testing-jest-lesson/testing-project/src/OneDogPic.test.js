import React from 'react';
import Enzyme, { shallow, mount } from 'enzyme';
import Adapter from 'enzyme-adapter-react-16';
import OneDogPic from './OneDogPic';

Enzyme.configure({ adapter: new Adapter() })

describe('OneDogPic component', () => {

  it('only render an img element on the screen', () => {
    const testWrapper = shallow(<OneDogPic />);
    expect(testWrapper.find('img')).toBeDefined();
  })

  it('pass the URL of an image of a random dog from the \
  DogPics API to the img when the component loads', () => {
    const testWrapper = shallow(<OneDogPic />);

    const mockSuccessResponse = { message: "dog-pic-url-here", status: "success" };
    const mockJsonPromise = Promise.resolve(mockSuccessResponse);
    const mockFetchPromise = Promise.resolve({
      json: () => mockJsonPromise,
    });

    jest.spyOn(global, 'fetch').mockImplementation(() => mockFetchPromise);

    process.nextTick(() => {
  		expect(testWrapper.find('img').prop('src')).toBeDefined();
  	})

    global.fetch.mockClear();
  })

  it('load and pass the URL of another random dog to the img \
  element whenever a user clicks on the img element', () => {
    const testWrapper = shallow(<OneDogPic />);

    const mockSuccessResponse = { message: "dog-pic-url-here", status: "success" };
    const mockJsonPromise = Promise.resolve(mockSuccessResponse);
    const mockFetchPromise = Promise.resolve({
      json: () => mockJsonPromise,
    });

    jest.spyOn(global, 'fetch').mockImplementation(() => mockFetchPromise);
    testWrapper.find('img').simulate('click');

    process.nextTick(() => {
      expect(testWrapper.find('img').prop('src')).toBeDefined();
    })

    global.fetch.mockClear();
  })

 })
